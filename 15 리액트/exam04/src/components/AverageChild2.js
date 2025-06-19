import react from 'react';
const AverageChild2 = () => {
  console.log('Average2 렌더링');
  return <h1>AverageChild2</h1>;
};

export default react.memo(AverageChild2);
