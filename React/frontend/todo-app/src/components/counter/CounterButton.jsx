
export default function CounterButton({by, incrementmethod, Decrementmethod}){


    function incrementCounterFunction(){
        incrementmethod(by)
    }
    function decrementCounterFunction(){
        Decrementmethod(by)
    }
    return(
        <div className="CounterButton">
            <button className="counterButton" onClick={incrementCounterFunction}>+{by}</button>
            <button className="counterButtonDec" onClick={decrementCounterFunction}>-{by}</button>
        </div> 
    );
}