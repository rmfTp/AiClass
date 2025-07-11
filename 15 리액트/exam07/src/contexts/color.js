import { Children, createContext, useState } from 'react';

//context 저장소 생성
const ColorContext = createContext({
  state: { color: '', subcolor: '' },
  action: {
    setColor: null,
    setSubColor: null,
  },
});

const ColorProvider = ({ children }) => {
  const [color, setColor] = useState('black');
  const [subColor, setSubColor] = useState('red');

  const value = {
    state: { color, subColor },
    actions: { setColor, setSubColor },
  };

  return (
    <ColorContext.Provider value={value}>{children}</ColorContext.Provider>
  );
};

const { Consumer: ColorConsumer } = ColorContext;

export { ColorProvider, ColorConsumer };

export default ColorContext;
