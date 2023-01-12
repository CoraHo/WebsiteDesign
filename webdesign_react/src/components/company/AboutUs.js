import React, {Component} from 'react';
import {connect} from "react-redux";
import {getAboutUs} from "../../actions/companyActions";
import PropTypes from "prop-types";


class AboutUs extends Component {

    componentDidMount() {
        console.log(1)
        console.log(this.props);
        // const {companyName} = this.props.match.params;
        this.props.getAboutUs("NAMI")
    }


    render() {
        const {company} = this.props.companyInfo;
        return (
            <div>
                <div className="about-us">
                    <div className="about-us-intro">
                        <h1>
                            {company.introduction}
                        </h1>
                    </div>

                    <div className="about-us-mission">
                        <h2>
                            {company.mission}
                        </h2>
                        These are mission of the company.
                    </div>

                    <div className="about-us-guides">
                        <h2>
                            {company.guidingPrinciples}
                        </h2>
                        These are guiding principles of the company.
                    </div>
                </div>
            </div>

        );
    }
}

AboutUs.propTypes = {
    companyInfo: PropTypes.object.isRequired,
    getAboutUs: PropTypes.func.isRequired
}

const mapStateToProps = state => ({
    companyInfo: state.companyInfo
})

export default connect(mapStateToProps, {getAboutUs})(AboutUs);