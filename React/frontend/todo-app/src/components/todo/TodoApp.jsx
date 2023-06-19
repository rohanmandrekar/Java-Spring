
import {BrowserRouter, Routes, Route, useParams, Link} from 'react-router-dom'
import LogoutComponent from './LogoutComponent'
import LoginComponent from './LoginComponent'
import ListTodoComponent from './ListTodoComponent'
import ErrorComponent from './ErrorComponent'
import WelcomeComponent from './WelcomeComponent'
import HeaderComponent from './HeaderComponent'
// import FooterComponent from './FooterComponent'
import './TodoApp.css'



export default function TodoApp(){
    return(
        <div className="TodoApp">
            
            <BrowserRouter>
                <HeaderComponent/>
                <Routes>
                    <Route path='/' element={<LoginComponent/>}></Route>
                    <Route path='/login' element={<LoginComponent/>}></Route>
                    <Route path='/welcome/:username' element={<WelcomeComponent/>}></Route>
                    <Route path='/todos' element={<ListTodoComponent/>}></Route>

                    <Route path='/logout' element={<LogoutComponent/>}></Route>
                    <Route path='*' element={<ErrorComponent/>}></Route>
                </Routes>
                {/* <FooterComponent/> */}
            </BrowserRouter>
            
            
            
        </div>
    )

}










