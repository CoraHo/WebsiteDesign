import React, {Component} from 'react';

class CreateStaff extends Component {
    render() {
        return (
            <div>
                <h1> Here is to set up the staff in your company </h1>

                <form>
                    <div>
                        <label htmlFor="setup-companyName"> First Name </label>
                        <input id="setup-companyName" className="setup-companyName"/>
                    </div>

                    <div>
                        <label htmlFor="setup-introduction"> Last Name </label>
                        <input id="setup-introduction" className="setup-introduction"></input>
                    </div>

                    <div>
                        <label htmlFor="setup-missions"> Position </label>
                        <textarea id="setup-missions"></textarea>
                    </div>

                    <div>
                        <label htmlFor="setup-guidingPrinciples"> Information </label>
                        <textarea id="setup-guidingPrinciples"></textarea>
                    </div>
                </form>
            </div>
        );
    }
}

export default CreateStaff;