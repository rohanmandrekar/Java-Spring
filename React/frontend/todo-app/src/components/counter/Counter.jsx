import './Counter.css'
import CounterButton from './CounterButton.jsx'
import {useState} from 'react'
import Reset from './Reset.jsx'


export default function Counter(){
    const [count,setCount] = useState(0);

    function incrementCounterParentFunction(by){
        setCount(count+by)
    }

    function DecrementCounterParentFunction(by){
        setCount(count-by)
    }

    function resetCount(){
        setCount(0)
    }

    return(
        <div>
        <span className="count">{count}</span><br></br>    
        <CounterButton by={1} 
        incrementmethod={incrementCounterParentFunction} 
        Decrementmethod={DecrementCounterParentFunction} />
        <CounterButton by={2} 
        incrementmethod={incrementCounterParentFunction}
         Decrementmethod={DecrementCounterParentFunction}/>
        <CounterButton by={5} 
        incrementmethod={incrementCounterParentFunction} 
        Decrementmethod={DecrementCounterParentFunction}/>
        <Reset resetCount={resetCount}/>

        </div>
    )
}




