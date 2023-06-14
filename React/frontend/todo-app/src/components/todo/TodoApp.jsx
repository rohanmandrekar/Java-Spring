import { useState } from 'react'
import './TodoApp.css'


export default function TodoApp(){
    return(
        <div className="TodoApp">
            Todo List App
            <LoginComponent/>
            {/* <WelcomeComponent/> */}
        </div>
    )

}

function LoginComponent(){

    const [username, setUser] = useState("user")
    const [password,setPassword]=useState("pass")
    const [showSuccess,setShowSuccess]=useState(false)
    const [showError,setShowError]=useState(false)

    function handleUsernameChange(event){
        // console.log(event.target.value);
        setUser(event.target.value)
    }

    function handlePasswordChange(event){
        // console.log(event.target.value);
        setPassword(event.target.value)
    }

    function handleSubmit(){
        if(username==='user' && password==='pass'){
            setShowSuccess(true)
        }
        else{
            setShowError(true)
        }
    }

    return(
        <div className="Login">
            <SuccessMessageComponent showSuccess={showSuccess}/>
            <ErrorMessageComponent showError={showError}/>
            
            <div className="LoginForm">
                <div>
                    <label>Username</label>
                    <input type="text" name= "username" value={username} onChange={handleUsernameChange}/>
                </div>

                <div>
                    <label>Password</label>
                    <input type="password" name= "password" value={password} onChange={handlePasswordChange}/>
                </div>

                <div>
                    <button type="button" name="login" onClick={handleSubmit} >Login</button>
                </div>

            </div>
        </div>
    )
}

function SuccessMessageComponent({showSuccess}){
    if(showSuccess){
    return(
        <div className='authenticatedMessage' style={{color:"green"}}>Authenticated Succesfully</div>
    )
    }
    else{
        return null
    }
}

function ErrorMessageComponent({showError}){
    if(showError){
    return(
        <div className='errorMessage' style={{color:"red"}}>Authention Failed</div>
    )
    }
    else{
        return null
    }
}

function WelcomeComponent(){
    return(
        <div className="Welcome">
            Welcome Component
        </div>
    )
}