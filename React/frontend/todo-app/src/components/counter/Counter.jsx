import './Counter.css'
import {useState} from 'react'

export default function Counter(){

    const [count,setCount] = useState(0);
  
    function incrementCounterFunction(){
        setCount(count+1)
    }
    function decrementCounterFunction(){
        setCount(count-1)
    }
    return(
        <div className="Counter">
            
            <span className="count">{count}</span><br></br>
            <button className="counterButton" onClick={incrementCounterFunction}>+1</button>
            <button className="counterButtonDec" onClick={decrementCounterFunction}>-1</button>
        </div> 
    );
}