const MyComponent = ({ color, favoriteNumber }) => {
  return (
    <>
      <h3 style={{ color: color }}>나의 멋진 컴포넌트 (함수)</h3>
      <h3>내가 좋아하는 숫자는 {favoriteNumber}입니다.</h3>
    </>
  );
};

export default MyComponent;
