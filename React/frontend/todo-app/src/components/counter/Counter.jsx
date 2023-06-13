import './Counter.css'
import {useState} from 'react'

export default function Counter({by}){

    const [count,setCount] = useState(0);
  
    function incrementCounterFunction(){
        setCount(count+by)
    }
    function decrementCounterFunction(){
        setCount(count-by)
    }
    return(
        <div className="Counter">
            
            <span className="count">{count}</span><br></br>
            <button className="counterButton" onClick={incrementCounterFunction}>+{by}</button>
            <button className="counterButtonDec" onClick={decrementCounterFunction}>-{by}</button>
        </div> 
    );
}