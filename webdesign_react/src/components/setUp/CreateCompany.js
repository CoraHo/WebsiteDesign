import React, {Component} from 'react';

class CreateCompany extends Component {
    render() {
        return (
            <div>
                <h1>Here is to set up the basic information of your company </h1>
                <form>
                    <div>
                        <label htmlFor="setup-companyName"> Company Name </label>
                        <input id="setup-companyName" className="setup-companyName"/>
                    </div>

                    <div>
                        <label htmlFor="setup-introduction"> Introduction </label>
                        <textarea id="setup-introduction" className="setup-introduction"></textarea>
                    </div>

                    <div>
                        <label htmlFor="setup-missions"> Missions </label>
                        <textarea id="setup-missions"></textarea>
                    </div>

                    <div>
                        <label htmlFor="setup-guidingPrinciples"> Guiding Principles </label>
                        <textarea id="setup-guidingPrinciples"></textarea>
                    </div>
                </form>

                <footer> You're all done! Next, go to set up the staff of your company! </footer>
            </div>
        );
    }
}

export default CreateCompany;