const TodoForm = ({ id, title, content, onChange }) => {
  return (
    <form>
      <div>
        <input name="title" placeholder="제목"></input>
      </div>
      <div>
        <textarea name="content" placeholder="내용" />
      </div>
      <button type="submit"></button>
    </form>
  );
};

export default TodoForm;
