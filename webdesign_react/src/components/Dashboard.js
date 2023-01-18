import React, {Component} from 'react';
import {Link} from "react-router-dom";

class Dashboard extends Component {

    constructor(props) {
        super(props);

        this.state = {
            companyName: 'Please write the company name'
        }

        this.handleChange = this.handleChange.bind(this);
        this.handleSubmit = this.handleSubmit.bind(this);
    }

    handleChange(event){
        this.setState({companyName: event.target.value});
    }

    handleSubmit(event){
        event.preventDefault();
        // navigate(`${this.state.companyName}/about`);
        this.props.history.push(`${this.state.companyName}/about`);
    }

    render() {
        return (
            <div>
                <h1> Welcome to Web Design! </h1>
                <h2> If you want to create a new company website, go to the link below ⬇️</h2>
                <Link to={'/setup/company'}> Create Company's Info </Link>

                <h2>If you want to view the company website you already created, input your company name below ⬇️ </h2>
                <form onSubmit={this.handleSubmit}>
                    <div>
                        <label htmlFor="companyName">Company Name</label>
                        <input id="companyName" type="text" value={this.state.value} onChange={this.handleChange}/>

                        <input type="submit" value="submit"/>
                    </div>
                </form>
            </div>
        );
    }
}

export default Dashboard;