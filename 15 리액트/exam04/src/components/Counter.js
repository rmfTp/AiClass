import { useState, useRef, useEffect } from 'react';

const Counter = () => {
  const [number, setNumber] = useState(0);
  const cntRef = useRef(0);
  const h1Ref = useRef(0);

  useEffect(() => {
    console.log('h1Ref', h1Ref);
    h1Ref.current.style.background = 'orange';
  }, [h1Ref]);

  const onDecrease = () => {
    setNumber(number - 1);
    cntRef.current--;
    console.log('cntRef.current', cntRef.current);
  };
  const onIncrease = () => {
    setNumber(number + 1);
    cntRef.current++;
    console.log('cntRef.current', cntRef.current);
  };
  return (
    <>
      <h1 ref={h1Ref}>{number}</h1>
      <button type="button" onClick={onDecrease}>
        -1
      </button>
      <button type="button" onClick={onIncrease}>
        +1
      </button>
    </>
  );
};

export default Counter;
