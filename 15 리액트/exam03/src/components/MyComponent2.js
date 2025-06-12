import { Component } from 'react';

class MyComponent2 extends Component {
  render() {
    // console.log('props', this.props);
    // console.dir(Object.getOwnPropertyDescriptor(this.props));
    // console.log('extensible', Object.isExtensible(this.props));
    // console.log('isFrosen', Object.isFrozen(this.props));
    // const style = {
    // };
    // const { color } = this.props;
    return (
      <h3
        style={{
          color: this.props.color,
          backgroundColor: this.props.background,
        }}
      >
        나의 멋진 컴포넌트 (클래스)
      </h3>
    );
  }
}

export default MyComponent2;
