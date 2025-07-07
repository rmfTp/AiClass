import styled from 'styled-components';
const StyledButton = styled.button`
  background: ${({ bg }) => bg ?? 'black'};
  color: ${({ color }) => color ?? 'white'};
  border: 0;
  height: 100px;
  line-height: 100px;
  font-size: 50px;
  width: 250px;
`;
const StyledComponent1 = () => {
  return (
    <div>
      <StyledButton color="darkgreen" bg="aqua">
        클릭
      </StyledButton>
    </div>
  );
};

export default StyledComponent1;
