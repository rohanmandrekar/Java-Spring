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
    return(
        <div className="Login">
            <div className="LoginForm">
                <div>
                    <label>Username</label>
                    <input type="text" name= "username"/>
                </div>

                <div>
                    <label>Password</label>
                    <input type="password" name= "password"/>
                </div>

                <div>
                    <button type="button" name="login">Login</button>
                </div>

            </div>
        </div>
    )
}

function WelcomeComponent(){
    return(
        <div className="Welcome">
            Welcome Component
        </div>
    )
}