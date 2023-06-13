
// import { Component } from 'react';
import './App.css';

// import LearningComponent from './components/learning-examples/LearningComponent';
import Counter from './components/counter/Counter';


function App() {
  return (
    <div className="App">
      {/* <LearningComponent></LearningComponent> */}
      <Counter/>
      {/* <PlayingWithPorperties property1="prop1" property2="prop2"/> */}
    </div>
  );
} 

// function PlayingWithPorperties({property1,property2}){
//   console.log(property1)
//   console.log(property2)
//   return(

//     <div>Props</div>
//   );
// }



export default App;
