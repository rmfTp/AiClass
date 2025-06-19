import react, { useState, useCallback, useMemo } from 'react';
import AverageChild1 from './AverageChild1';

const getAverage = (items) => {
  if (items.length === 0) return 0;

  const total = items.reduce((a, b) => a + b);

  const avg = Math.round((total / items.length) * 10) / 10;
  console.log('getAverage 호출');
  return avg;
};

const Average = () => {
  const [number, setNumber] = useState('');
  const [items, setItems] = useState([]);

  const onChange = useCallback((e) => {
    try {
      setNumber(Number(e.target.value.trim()));
    } catch (e) {}
  }, []);

  const onSubmit = useCallback(
    (e) => {
      e.preventDefault();
      setItems((items) => items.concat(number));
    },
    [number],
  );

  const avg = useMemo(() => getAverage(items), [items]);

  return (
    <>
      <form onSubmit={onSubmit} autoComplete="off">
        <input type="number" onChange={onChange} value={number} />
        <button type="submit">등록</button>
      </form>
      <ul>
        {items.map((item, i) => (
          <li key={i + '-' + item}>{item}</li>
        ))}
      </ul>
      <div>평균 : {avg}</div>
      <AverageChild1 />
    </>
  );
};

export default react.memo(Average);
