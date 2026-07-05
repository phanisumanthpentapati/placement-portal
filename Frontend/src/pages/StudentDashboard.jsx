import { useEffect, useState } from "react";
import Navbar from "../components/Navbar";
import api from "../services/api";

function StudentDashboard() {

    const [companies, setCompanies] = useState([]);

    useEffect(() => {

        fetchCompanies();

    }, []);

    const fetchCompanies = async () => {

        try {

            const response = await api.get("/companies");

            setCompanies(response.data);

        } catch (error) {

            console.error(error);

            alert("Unable to load companies");

        }

    };

    return (
        <>
            <Navbar />

            <div className="container mt-5">

                <h2 className="mb-4">
                    Welcome Student 👋
                </h2>

                <div className="row">

                    <div className="col-md-3 mb-4">
                        <div className="card shadow text-center p-4">
                            <h4>🏢</h4>
                            <h5>Companies</h5>
                            <p>View Available Jobs</p>
                        </div>
                    </div>

                    <div className="col-md-3 mb-4">
                        <div className="card shadow text-center p-4">
                            <h4>📄</h4>
                            <h5>Applications</h5>
                            <p>Track Applications</p>
                        </div>
                    </div>

                    <div className="col-md-3 mb-4">
                        <div className="card shadow text-center p-4">
                            <h4>🤖</h4>
                            <h5>Resume Analyzer</h5>
                            <p>Analyze Resume</p>
                        </div>
                    </div>

                    <div className="col-md-3 mb-4">
                        <div className="card shadow text-center p-4">
                            <h4>📚</h4>
                            <h5>Preparation</h5>
                            <p>Aptitude & Coding</p>
                        </div>
                    </div>

                </div>

                <hr />

                <h3 className="mb-4">
                    Latest Companies
                </h3>

                <div className="row">

                    {companies.map((company) => (

                        <div
                            className="col-md-4 mb-4"
                            key={company.id}
                        >

                            <div className="card shadow h-100">

                                <div className="card-body">

                                    <h4 className="text-primary">
                                        {company.companyName}
                                    </h4>

                                    <hr />

                                    <p>
                                        <strong>Role :</strong>{" "}
                                        {company.jobRole}
                                    </p>

                                    <p>
                                        <strong>Package :</strong>{" "}
                                        {company.packageLpa} LPA
                                    </p>

                                    <p>
                                        <strong>Minimum CGPA :</strong>{" "}
                                        {company.eligibilityCgpa}
                                    </p>

                                    <p>
                                        <strong>Location :</strong>{" "}
                                        {company.location}
                                    </p>

                                    <button
                                        className="btn btn-success w-100"
                                    >
                                        Apply Now
                                    </button>

                                </div>

                            </div>

                        </div>

                    ))}

                </div>

            </div>
        </>
    );
}

export default StudentDashboard;