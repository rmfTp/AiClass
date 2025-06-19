import react from 'react';
import AverageChild2 from './AverageChild2';
const AverageChild1 = () => {
  console.log('Average1 렌더링');
  return (
    <>
      <h1>AverageChild1</h1>
      <AverageChild2 />
    </>
  );
};

export default react.memo(AverageChild1);
