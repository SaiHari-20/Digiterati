import React, { useState } from "react";

interface REFormProps {
  onAddBike: (bike: { Model: string; Year: string; Image: string;Price:string }) => void;
}

const REForm: React.FC<REFormProps> = ({ onAddBike }) => {
  const [model, setModel] = useState("");
  const [year, setYear] = useState("");
  const [image, setImage] = useState("");
  const [price, setPrice] = useState("");

  const handleSubmit = async (e: any) => {
    e.preventDefault();

    if (!model || !year || !image) {
      alert("All fields are required!");
      return;
    }

    const newBike = {
      Model: model,
      Year: year,
      Image: image,
      Price: price
    };

    onAddBike(newBike);

    setModel("");
    setYear("");
    setImage("");
    setPrice("");
  };

  return (
    <div className="card p-3 my-4" style={{ backgroundColor: 'lightgrey' }}>
    <h4 style={{ fontWeight: 'bold', textAlign: 'center' }}>ADD NEW RE-BIKE</h4>
      <form onSubmit={handleSubmit}>
        <div className="mb-2">
          <label className="form-label" style={{ fontWeight: 'bold' }}>RE MODEL</label>
          <input
            type="text"
            className="form-control"
            value={model}
            onChange={(e) => setModel(e.target.value)}
            placeholder="Enter RE-Bike Model"
          />
        </div>

        <div className="mb-2">
          <label className="form-label" style={{ fontWeight: 'bold' }}>RELEASE YEAR</label>
          <input
            type="text"
            className="form-control"
            value={year}
            onChange={(e) => setYear(e.target.value)}
            placeholder="Enter Release Year"
          />
        </div>

        <div className="mb-2">
          <label className="form-label" style={{ fontWeight: 'bold' }}>IMAGE URL</label>
          <input
            type="text"
            className="form-control"
            value={image}
            onChange={(e) => setImage(e.target.value)}
            placeholder="Enter Image URL"
          />
        </div>

        <div className="mb-2">
          <label className="form-label" style={{ fontWeight: 'bold' }}>ON-ROAD PRICE</label>
          <input
            type="text"
            className="form-control"
            value={price}
            onChange={(e) => setPrice(e.target.value)}
            placeholder="Enter On-Road Price"
          />
        </div>

        <button type="submit" className="btn btn-success my-2">
          Add Bike
        </button>
      </form>
    </div>
  );
};

export default REForm;
