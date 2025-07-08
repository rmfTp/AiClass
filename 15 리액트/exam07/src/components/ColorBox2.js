import ColorContext from '../contexts/color';
import { useContext } from 'react';
const ColorBox2 = () => {
  const {
    state: { color, subColor },
  } = useContext(ColorContext);

  return (
    <>
      <div
        style={{
          width: '64px',
          height: '64px',
          background: color,
        }}
      ></div>
      <div
        style={{
          width: '128px',
          height: '128px',
          background: subColor,
        }}
      ></div>
    </>
  );
};

export default ColorBox2;
