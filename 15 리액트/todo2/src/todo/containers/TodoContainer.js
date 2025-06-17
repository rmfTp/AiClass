import { useState } from 'react';
import TodoForm from '../conponents/TodoForm';
import TodoItems from '../conponents/TodoItems';

const TodoContainer = () => {
  const [form, setForm] = useState();
  const [items, setItems] = useState();
  const [errors, setErrors] = useState([]);

  const onSubmit = (e) => {
    e.preventDefault();
    setItems(items.concat(form));

    const Errors = {}
    if (const title == )
  };
  const onChange = (e) => {
    setForm({ ...form, [e.target.name]: e.target.value });
  };
  const onToggle = () => {};
  const onRemove = () => {};
  const onRemoveAll = () => {};

  return (
    <>
      <TodoForm form={form} />
      <TodoItems
        items={items}
        onToggle={onToggle}
        onRemove={onRemove}
        onRemoveAll={onRemoveAll}
      />
    </>
  );
};

export default TodoContainer;
