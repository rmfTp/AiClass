const MyComponent = (props) => {
  console.log('props', props);
  console.log('-----------------------------------');
  console.log(Object.getOwnPropertyDescriptor(props));
  console.log(Object.isExtensible(props));
  return (
    <>
      <div>나의 멋진 함수형 컴포넌트</div>
      <div>{props.name}님, 반갑습니다.</div>
      <div>{props.number}를 좋아하시는군요.</div>
    </>
  );
};

export default MyComponent;
