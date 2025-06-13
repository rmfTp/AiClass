import { useState } from 'react';
import TodoForm from '../components/TodoForm';
import TodoItems from '../components/TodoItems';
const TodoContainer = () => {
  const [form, setForm] = useState({});

  const onSubmit = (e) => {
    e.preventDefault();
  };

  const onChange = (e) => {
    setForm({ ...form, [e.target.name]: e.target.value });
  };

  return (
    <>
      <TodoForm onSubmit={onSubmit} onChange={onChange} />
      <TodoItems />
      todo: {form.title}
      <br />
      todoContent: {form.content}
    </>
  );
};

export default TodoContainer;
