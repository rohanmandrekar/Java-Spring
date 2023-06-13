import './Counter.css'
import {useState} from 'react'
import {PropTypes} from "prop-types";


export default function Counter(){
    const [count,setCount] = useState(0);

    function incrementCounterParentFunction(by){
        setCount(count+by)
    }

    function DecrementCounterParentFunction(by){
        setCount(count-by)
    }

    return(
        <div>
        <span className="count">{count}</span><br></br>    
        <CounterButton by={1} incrementmethod={incrementCounterParentFunction} Decrementmethod={DecrementCounterParentFunction} />
        <CounterButton by={2} incrementmethod={incrementCounterParentFunction} Decrementmethod={DecrementCounterParentFunction}/>
        <CounterButton by={5} incrementmethod={incrementCounterParentFunction} Decrementmethod={DecrementCounterParentFunction}/>
        </div>
    )
}


 function CounterButton({by, incrementmethod, Decrementmethod}){

    const [count,setCount] = useState(0);
  
    function incrementCounterFunction(){
        setCount(count+by)
        incrementmethod(by)
    }
    function decrementCounterFunction(){
        setCount(count-by)
        Decrementmethod(by)
    }
    return(
        <div className="Counter">
            
            {/* <span className="count">{count}</span><br></br> */}
            <button className="counterButton" onClick={incrementCounterFunction}>+{by}</button>
            <button className="counterButtonDec" onClick={decrementCounterFunction}>-{by}</button>
        </div> 
    );

//     CounterButton.propTypes={
//         by: PropTypes.number
//       }
      
//       CounterButton.defaultProps={
//         by:1
//       }
// 
}

