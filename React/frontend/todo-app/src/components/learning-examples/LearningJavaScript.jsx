
const person={
    name:'Rohan',
    address: {
        line1:'2627 live oak st',
        city: 'Dallas',
        state: 'TX'
    },
    profiles:['LinkedIn','GitHub','Instagram'],
    PrintProfile:()=>{
        person.profiles.map(
            (profile)=>{
                console.log(profile)
            }
        )
    }
}



export default function LearningJavascript(){
    return(
        <>
        <div>{person.name}</div>
        <div>{person.address.line1}</div>
        <div>{person.address.city}</div>
        <div>{person.address.state}</div>
        <div>{person.profiles[0]}</div>
        <div>{person.PrintProfile()}</div>
        </>
    );
}