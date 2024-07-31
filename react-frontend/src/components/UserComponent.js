import React from "react";
import Userservice from "../services/Userservice";


class UserComponent extends React.Component{

    constructor(props){
        super(props)
        this.state ={
            users:[]     //userarray
        }  
    }

    //life sycle method to call REST API 
    componentDidMount(){
        Userservice.getUsers().then((response) =>{
            this.setState({users:response.data})
        });
    }

    render(){   //classname is camel case  render is a also lifecycle method
        return (
            <div>
                <h1 className="text-center">Users List</h1>
                <table className="table table-striped">
                    <thead>
                        <tr>
                            <td>User Id </td>
                            <td>User First Name </td>
                            <td>User Last Name </td> 
                            <td>User Email Id </td>
                        </tr>
                    </thead>
                    <tbody>
                        { 
                            this.state.users.map(   //iterate users array and pass and display list of users
                                user =>
                                    <tr key={user.id}>
                                        <td>{user.id}</td>
                                        <td>{user.firstName}</td>
                                        <td>{user.lastName}</td>
                                        <td>{user.email}</td>
                                    </tr>
                            )
                        }
                    </tbody>
                </table>

            </div>
        )
    }

}

export default UserComponent;