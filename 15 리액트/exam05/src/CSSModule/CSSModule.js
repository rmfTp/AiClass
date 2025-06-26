import styles from './CSSModule.module.scss';
console.log('styles', styles);
const CSSModule = () => {
  return (
    <>
      <div className={`${styles.wrapper}`}>
        dkssudgktpdy, qksrkqtmqslek.
        <span className="something">wjsms CSSModuledlqslek</span>
      </div>
      <div className={styles.inverted}>
        dkssudgktpdy, qksrkqtmqslek. wjsms CSSModuledlqslek
      </div>
    </>
  );
};
export default CSSModule;
