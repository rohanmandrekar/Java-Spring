
export default function CounterButton({by, incrementmethod, Decrementmethod}){

    return(
        <div className="CounterButton">
            <button className="counterButton" onClick={()=>incrementmethod(by)}>+{by}</button>
            <button className="counterButtonDec" onClick={()=>Decrementmethod(by)}>-{by}</button>
        </div> 
    );
}