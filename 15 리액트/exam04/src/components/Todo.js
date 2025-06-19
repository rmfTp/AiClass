import { useState } from 'react';

function initialItems() {
  console.log('initialItems() 호출');
  return [...new Array(10).key].map((i) => ({ id: i + 1, title: `할일${i}` }));
}

const Todo = () => {
  const [items, setItems] = useState(initialItems);
  const [title, setTitle] = useState();

  const onClick = () => {
    setItems((prev) => prev.concat({ id: prev.length + 1, title }));
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
    </>
  );
};

export default Todo;
