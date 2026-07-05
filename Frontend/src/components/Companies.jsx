function Companies() {
  const companies = [
    "Google",
    "Microsoft",
    "Amazon",
    "Infosys",
    "TCS",
    "Accenture"
  ];

  return (
    <section className="container my-5">
      <h2 className="text-center mb-4">Top Companies Hiring</h2>

      <div className="row">
        {companies.map((company, index) => (
          <div className="col-md-4 mb-3" key={index}>
            <div className="card shadow text-center p-4">
              <h4>{company}</h4>
            </div>
          </div>
        ))}
      </div>
    </section>
  );
}

export default Companies;