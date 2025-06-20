import { useEffect } from 'react';

const News = () => {
  useEffect(() => {
    fetch(
      'https://newsapi.org/v2/top-headlines?country=us&apiKey=261a7a7534084e0a91355d4785e007d0',
    )
      .then((res) => res.json())
      .then((items) => console.log(items));
  }, []);
};
export default News;
