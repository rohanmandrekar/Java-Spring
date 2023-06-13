
// import { Component } from 'react';
import './App.css';
import {PropTypes} from "prop-types";
// import LearningComponent from './components/learning-examples/LearningComponent';
import Counter from './components/counter/Counter';

function App() {
  return (
    <div className="App">
      {/* <LearningComponent></LearningComponent> */}
      <Counter by={1}/>
      <Counter by={2}/>
      <Counter by={5}/>
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

Counter.PropTypes={
  by: PropTypes.number
}

Counter.defaultProps={
  by:1
}

export default App;
