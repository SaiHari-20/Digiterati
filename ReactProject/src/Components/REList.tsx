import React, { useState , useEffect } from "react";
import RESearch from "./RESearch";
import REForm from "./REForm";
import RECard from "./RECard";

const REList = () => {
  const [bikes, setBikes] = useState<any[]>([]);
  const [filteredBikes, setFilteredBikes] = useState<any[]>([]); // For search results

  const fetchBike = async () => {
    try {
      const response = await fetch("http://localhost:5000/bikes");
      const data = await response.json();
      setBikes(data);
      setFilteredBikes(data);
    } catch (error) {
      console.error("Error fetching bikes:", error);
    }
  };

  const addBike = async (newBike: any) => {
    try {
      const response = await fetch("http://localhost:5000/bikes", {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(newBike),
      });

      if (response.ok) {
        const addedBike = await response.json();
        setBikes([...bikes, addedBike]); 
        setFilteredBikes([...bikes, addedBike]);
      }
    } catch (error) {
      console.error("Error adding bike:", error);
    }
  };

  // Handle search functionality
  const handleSearch = (query :any) => {
    if (!query) {
      setFilteredBikes(bikes);
    } else {
      const filtered = bikes.filter((bike) =>
        bike.Model.toLowerCase().includes(query.toLowerCase())
      );
      setFilteredBikes(filtered);
    }
  };

  useEffect(() => {
    fetchBike();
  }, []);

  return (
    <div className="container" >
      <h2 className="text-center my-4" style={{fontWeight:'bold'}}>WELCOME TO THE WORLD OF ROYAL ENFIELD </h2>
      <RESearch onSearch={handleSearch} />
      <REForm onAddBike={addBike} />
      <div className="row">
        {filteredBikes.map((bike) => (
          <RECard key={bike.id} bike={bike} />
        ))}
      </div>
    </div>
  );
};

export default REList;