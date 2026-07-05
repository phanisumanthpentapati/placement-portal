import Navbar from "../components/Navbar";

function AdminDashboard() {
    return (
        <>
            <Navbar />

            <div className="container mt-5">

                <h2>Welcome Admin 👋</h2>

                <div className="row mt-4">

                    <div className="col-md-4">
                        <div className="card shadow p-4 text-center">
                            <h4>Students</h4>
                            <p>Manage Students</p>
                        </div>
                    </div>

                    <div className="col-md-4">
                        <div className="card shadow p-4 text-center">
                            <h4>Recruiters</h4>
                            <p>Manage Recruiters</p>
                        </div>
                    </div>

                    <div className="col-md-4">
                        <div className="card shadow p-4 text-center">
                            <h4>Companies</h4>
                            <p>Manage Companies</p>
                        </div>
                    </div>

                </div>

            </div>
        </>
    );
}

export default AdminDashboard;