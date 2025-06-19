import { useState, useEffect } from 'react';

function initialItems() {
  return [...new Array(10).keys()].map((i) => ({
    id: i + 1,
    title: `할일${i}`,
  }));
}

const Todo = () => {
  const [items, setItems] = useState(initialItems);
  const [title, setTitle] = useState('');
  const [cnt, setCnt] = useState(0);

  useEffect(() => {
    console.log('컴포넌트 마운트 시 1회 실행');
  }, []); //실행기준

  useEffect(() => {
    console.log('숫자변경', cnt);
    return () => {
      console.log('뒷정리 함수');
    };
  }, [cnt]);

  const onClick = () => {
    setItems((prev) => prev.concat({ id: prev.length + 1, title }));
  };

  const onRefresh = () => {
    setCnt(cnt + 1);
  };

  return (
    <>
      <input
        type="text"
        onChange={(e) => setTitle(e.target.value)}
        value={title}
      />
      <button type="button" onClick={onClick}>
        등록
      </button>
      <ul>
        {items.map(({ id, title }) => (
          <li key={id}>{title}</li>
        ))}
      </ul>
      <button type="button" onClick={onRefresh}>
        화면갱신
      </button>
    </>
  );
};

export default Todo;
