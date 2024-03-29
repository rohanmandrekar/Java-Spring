import { useNavigate, useParams } from "react-router-dom"
import { useAuth } from "./security/AuthContext"
import { createTodoApi, retriveTodoByIdApi, updateTodoApi } from "./api/TodoApiService"
import { useEffect, useState } from "react"
import { Formik, Form, Field, ErrorMessage } from "formik"

export default function TodoComponent(){
    const {id} = useParams()
    const authContext = useAuth()
    const username=authContext.username
    const navigate=useNavigate()
    const token=authContext.token

    const [description,setDescription] = useState('')
    const [targetDate, setTargetDate] = useState('')

    useEffect(
        ()=>retrieveTodo(id,token)
    )

    function retrieveTodo(id,token){
        if(id!==-1){
        retriveTodoByIdApi(username, id,token)
        .then(response=>{
            setDescription(response.data.description)
            setTargetDate(response.data.targetDate)
        })
        .catch(error=>console.log(error))
        }
    
    }


    function onSubmit(values){
        const todo = {id:id, username:username, description:values.description,targetDate:values.targetDate,done: false}

        if(id==-1){
            createTodoApi(username,todo,token)
            .then(response  => navigate('/todos'))
            .catch(error=>console.log(error))
           }
        else{   
          updateTodoApi(username, id, todo,token)
          .then(response  => navigate('/todos'))
          .catch(error=>console.log(error))
        }
    }

    function validate(values){
        let errors ={}

        if (values.description.length<1){
            errors.description= "Task cannot be blank"
        }
        if(values.targetDate===""){
            errors.targetDate="Date cannot be blank"
        }

        return errors

    }

    return(
        <div className="container">
            <h1>Enter Todo Details</h1>
            <div>
                <Formik initialValues={{description, targetDate}}
                    enableReinitialize={true}
                    onSubmit={onSubmit}
                    validate= {validate}
                >
                    {
                        (props)=>(
                            <Form>
                                <ErrorMessage 
                                name="description"
                                component= "div"
                                className="alert alert-warning"
                                />

                                <ErrorMessage 
                                name="targetDate"
                                component= "div"
                                className="alert alert-warning"
                                />


                                <fieldset className="form-group">
                                    <label>Description</label>
                                    <Field type="text" className="form-control" name="description"/>
                                </fieldset>

                                <fieldset className="form-group">
                                    <label>Target Date</label>
                                    <Field type="date" className="form-control" name="targetDate"/>
                                </fieldset>
                                <div>
                                    <button className="btn btn-success m-4" type="submit">Save Changes</button>
                                </div>
                            </Form>
                        )
                    }
                </Formik>
            </div>
        </div>
    )
}