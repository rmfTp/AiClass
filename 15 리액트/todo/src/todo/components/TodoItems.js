import { MdCheckBox, MdCheckBoxOutlineBlank } from 'react-icons/md';
const TodoItems = ({ items }) => {
  return (
    <ul>
      {items.map(({ id, title, content }) => (
        <li key={id}>
          {checked ? <MdCheckBox /> : <MdCheckBoxOutlineBlank />}
          {title}/{content}
        </li>
      ))}
    </ul>
  );
};

export default TodoItems;
