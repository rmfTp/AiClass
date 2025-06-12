import { Component } from 'react';

class MyComponent2 extends Component {
  render() {
    console.log('props', this.props);
    return <h3 color="red">나의 멋진 컴포넌트 (클래스)</h3>;
  }
}

export default MyComponent2;
