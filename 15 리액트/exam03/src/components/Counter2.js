import { Component } from 'react';

const Counter2 extends Component {
  state = {
    number:0,
  };
  render() {
    const { number } = this.state;
    return(
      <>
        <h1>{number}</h1>
        <button type='button' onClick={() => this.setState({ number: number - 1 })}>-1</button>
        <button type='button' onClick={() => this.setState({ number: number + 1 })}>+1</button>
      </>
    )
  }
};

export default Counter;
