import './Counter.css'

export default function Counter(){
  
    function incrementCounterFunction(){
        console.log('incremented')
    }
    return(
        <div className="Counter">
            
            <span className="count">0</span><br></br>
            <button className="counterButton" onClick={incrementCounterFunction}>+1</button>
            </div> 
    );
}