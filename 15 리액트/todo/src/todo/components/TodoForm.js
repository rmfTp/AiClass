import { FaPlusSquare } from 'react-icons/fa';
const TodoForm = ({ onSubmit, onChange, form, errors }) => {
  return (
    <form onSubmit={onSubmit}>
      <div>
        <input
          type="text"
          onChange={onChange}
          name="title"
          placeholder="할일"
          value={form.title}
        />
        {errors?.title && <div>{errors.title}</div>}
      </div>
      <div>
        <textarea
          onChange={onChange}
          name="content"
          placeholder="내용"
          value={form.content}
        />
        {errors?.content && <div>{errors.content}</div>}
      </div>
      <button type="submit">
        <FaPlusSquare />
      </button>
    </form>
  );
};

export default TodoForm;
