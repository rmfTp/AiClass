import TodoItem from '/TodoItem';
const TodoItems = ({ onToggle, onRemove, onRemoveAll }) => {
  return <TodoItem onToggle={onToggle} onRemove={onRemove} />;
};

export default TodoItems;
