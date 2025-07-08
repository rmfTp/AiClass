import ColorContext from '../contexts/color';
import { useContext } from 'react';
const ColorBox = () => {
  const value = useContext(ColorContext);
  return (
    <div
      style={{
        width: '64px',
        height: '64px',
        background: value.color,
      }}
    />
  );
  // <ColorContext.Consumer>
  //   {(value) => (
  //     <div
  //       style={{
  //         width: '64px',
  //         height: '64px',
  //         background: value.color,
  //       }}
  //     />
  //   )}
  // </ColorContext.Consumer>
};

export default ColorBox;
