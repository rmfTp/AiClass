import TodoItem from './TodoItem';
import { FaInfoCircle } from 'react-icons/fa';

const TodoItems = ({ items, onToggle, onRemove, onRemoveAll }) => {
  if (!items || items.length === 0) return <h2>등록된 스케줄이 없습니다</h2>;
  return (
    <>
      <ul>
        {items.map((props) => (
          <TodoItem
            key={props.id}
            {...props}
            onToggle={onToggle}
            onRemove={onRemove}
          />
        ))}
      </ul>
      <button type="button" onClick={onRemoveAll}>
        <FaInfoCircle />
        선택 스케줄 삭제
      </button>
    </>
  );
};

// const TodoItems = ({ items }) => {
//   return (
//     <ul>
//       {items.map((props) => (
//         <>
//           <TodoItem {...props} />
//           {/* <li key={id}>
//             // {checked ? <MdCheckBox /> : <MdCheckBoxOutlineBlank />}
//             // {title}/{content}
//             //{' '}
//           </li> */}
//         </>
//       ))}
//     </ul>
//   );
// };

export default TodoItems;
