package activityTypes
import main.activityTypes.*

val allActivities = mapOf(

    // ===== HRK =====

    // Chapter 1: Measurement
    "hrk_1_1_physical_quantities_standards_and_units" to hrk_1_1_physical_quantities_standards_and_units,
    "hrk_1_2_the_international_system_of_units" to hrk_1_2_the_international_system_of_units,
    "hrk_1_3_the_standard_of_time" to hrk_1_3_the_standard_of_time,
    "hrk_1_4_the_standard_of_length" to hrk_1_4_the_standard_of_length,
    "hrk_1_5_the_standard_of_mass" to hrk_1_5_the_standard_of_mass,
    "hrk_1_6_precision_and_significant_figures" to hrk_1_6_precision_and_significant_figures,
    "hrk_1_7_dimensional_analysis" to hrk_1_7_dimensional_analysis,

    // Chapter 2: Motion in One Dimension
    "hrk_2_1_kinematics_with_vectors" to hrk_2_1_kinematics_with_vectors,
    "hrk_2_2_properties_of_vectors" to hrk_2_2_properties_of_vectors,
    "hrk_2_3_position_velocity_and_acceleration_vectors" to hrk_2_3_position_velocity_and_acceleration_vectors,
    "hrk_2_4_one_dimensional_kinematics" to hrk_2_4_one_dimensional_kinematics,
    "hrk_2_5_motion_with_constant_acceleration" to hrk_2_5_motion_with_constant_acceleration,
    "hrk_2_6_freely_falling_bodies" to hrk_2_6_freely_falling_bodies,

    // Chapter 3: Force and Newton's Laws
    "hrk_3_1_classical_mechanics" to hrk_3_1_classical_mechanics,
    "hrk_3_2_newtons_first_law" to hrk_3_2_newtons_first_law,
    "hrk_3_3_force" to hrk_3_3_force,
    "hrk_3_4_mass" to hrk_3_4_mass,
    "hrk_3_5_newtons_second_law" to hrk_3_5_newtons_second_law,
    "hrk_3_6_newtons_third_law" to hrk_3_6_newtons_third_law,
    "hrk_3_7_weight_and_mass" to hrk_3_7_weight_and_mass,
    "hrk_3_8_applications_of_newtons_laws_in_one_dimension" to hrk_3_8_applications_of_newtons_laws_in_one_dimension,

    // Chapter 4: Motion in Two and Three Dimensions
    "hrk_4_1_motion_in_three_dimensions_with_constant_acceleration" to hrk_4_1_motion_in_three_dimensions_with_constant_acceleration,
    "hrk_4_2_newtons_laws_in_three_dimensional_vector_form" to hrk_4_2_newtons_laws_in_three_dimensional_vector_form,
    "hrk_4_3_projectile_motion" to hrk_4_3_projectile_motion,
    "hrk_4_4_drag_forces_and_the_motion_of_projectiles_optional" to hrk_4_4_drag_forces_and_the_motion_of_projectiles_optional,
    "hrk_4_5_uniform_circular_motion" to hrk_4_5_uniform_circular_motion,
    "hrk_4_6_relative_motion" to hrk_4_6_relative_motion,

    // Chapter 5: Applications of Newton's Laws
    "hrk_5_1_force_laws" to hrk_5_1_force_laws,
    "hrk_5_2_tension_and_normal_forces" to hrk_5_2_tension_and_normal_forces,
    "hrk_5_3_frictional_forces" to hrk_5_3_frictional_forces,
    "hrk_5_4_the_dynamics_of_uniform_circular_motion" to hrk_5_4_the_dynamics_of_uniform_circular_motion,
    "hrk_5_5_time_dependent_forces_optional" to hrk_5_5_time_dependent_forces_optional,
    "hrk_5_6_noninertial_frames_and_pseudoforces_optional" to hrk_5_6_noninertial_frames_and_pseudoforces_optional,
    "hrk_5_7_limitations_of_newtons_laws_optional" to hrk_5_7_limitations_of_newtons_laws_optional,

    // Chapter 6: Momentum
    "hrk_6_1_collisions" to hrk_6_1_collisions,
    "hrk_6_2_linear_momentum" to hrk_6_2_linear_momentum,
    "hrk_6_3_impulse_and_momentum" to hrk_6_3_impulse_and_momentum,
    "hrk_6_4_conservation_of_momentum" to hrk_6_4_conservation_of_momentum,
    "hrk_6_5_two_body_collisions" to hrk_6_5_two_body_collisions,

    // Chapter 7: Systems of Particles
    "hrk_7_1_the_motion_of_a_complex_object" to hrk_7_1_the_motion_of_a_complex_object,
    "hrk_7_2_two_particle_systems" to hrk_7_2_two_particle_systems,
    "hrk_7_3_many_particle_systems" to hrk_7_3_many_particle_systems,
    "hrk_7_4_center_of_mass_of_solid_objects" to hrk_7_4_center_of_mass_of_solid_objects,
    "hrk_7_5_conservation_of_momentum_in_a_system_of_particles" to hrk_7_5_conservation_of_momentum_in_a_system_of_particles,
    "hrk_7_6_systems_of_variable_mass_optional" to hrk_7_6_systems_of_variable_mass_optional,

    // Chapter 8: Rotational Kinematics
    "hrk_8_1_rotational_motion" to hrk_8_1_rotational_motion,
    "hrk_8_2_the_rotational_variables" to hrk_8_2_the_rotational_variables,
    "hrk_8_3_rotational_quantities_as_vectors" to hrk_8_3_rotational_quantities_as_vectors,
    "hrk_8_4_rotation_with_constant_angular_acceleration" to hrk_8_4_rotation_with_constant_angular_acceleration,
    "hrk_8_5_relationships_between_linear_and_angular_variables" to hrk_8_5_relationships_between_linear_and_angular_variables,
    "hrk_8_6_vector_relationships_between_linear_and_angular_variables_optional" to hrk_8_6_vector_relationships_between_linear_and_angular_variables_optional,

    // Chapter 9: Rotational Dynamics
    "hrk_9_1_torque" to hrk_9_1_torque,
    "hrk_9_2_rotational_inertia_and_newtons_second_law" to hrk_9_2_rotational_inertia_and_newtons_second_law,
    "hrk_9_3_rotational_inertia_of_solid_bodies" to hrk_9_3_rotational_inertia_of_solid_bodies,
    "hrk_9_4_torque_due_to_gravity" to hrk_9_4_torque_due_to_gravity,
    "hrk_9_5_equilibrium_applications_of_newtons_laws_for_rotation" to hrk_9_5_equilibrium_applications_of_newtons_laws_for_rotation,
    "hrk_9_6_nonequilibrium_applications_of_newtons_laws_for_rotation" to hrk_9_6_nonequilibrium_applications_of_newtons_laws_for_rotation,
    "hrk_9_7_combined_rotational_and_translational_motion" to hrk_9_7_combined_rotational_and_translational_motion,

    // Chapter 10: Angular Momentum
    "hrk_10_1_angular_momentum_of_a_particle" to hrk_10_1_angular_momentum_of_a_particle,
    "hrk_10_2_systems_of_particles" to hrk_10_2_systems_of_particles,
    "hrk_10_3_angular_momentum_and_angular_velocity" to hrk_10_3_angular_momentum_and_angular_velocity,
    "hrk_10_4_conservation_of_angular_momentum" to hrk_10_4_conservation_of_angular_momentum,
    "hrk_10_5_the_spinning_top" to hrk_10_5_the_spinning_top,
    "hrk_10_6_review_of_rotational_dynamics" to hrk_10_6_review_of_rotational_dynamics,

    // Chapter 11: Energy 1: Work and Kinetic Energy
    "hrk_11_1_work_and_energy" to hrk_11_1_work_and_energy,
    "hrk_11_2_work_done_by_a_constant_force" to hrk_11_2_work_done_by_a_constant_force,
    "hrk_11_3_power" to hrk_11_3_power,
    "hrk_11_4_work_done_by_a_variable_force" to hrk_11_4_work_done_by_a_variable_force,
    "hrk_11_5_work_done_by_a_variable_force_two_dimensional_case_optional" to hrk_11_5_work_done_by_a_variable_force_two_dimensional_case_optional,
    "hrk_11_6_kinetic_energy_and_the_work_energy_theorem" to hrk_11_6_kinetic_energy_and_the_work_energy_theorem,
    "hrk_11_7_work_and_kinetic_energy_in_rotational_motion" to hrk_11_7_work_and_kinetic_energy_in_rotational_motion,
    "hrk_11_8_kinetic_energy_in_collisions" to hrk_11_8_kinetic_energy_in_collisions,

    // Chapter 12: Energy 2: Potential Energy
    "hrk_12_1_conservative_forces" to hrk_12_1_conservative_forces,
    "hrk_12_2_potential_energy" to hrk_12_2_potential_energy,
    "hrk_12_3_conservation_of_mechanical_energy" to hrk_12_3_conservation_of_mechanical_energy,
    "hrk_12_4_energy_conservation_in_rotational_motion" to hrk_12_4_energy_conservation_in_rotational_motion,
    "hrk_12_5_one_dimensional_conservative_systems_the_complete_solution" to hrk_12_5_one_dimensional_conservative_systems_the_complete_solution,
    "hrk_12_6_three_dimensional_conservative_systems_optional" to hrk_12_6_three_dimensional_conservative_systems_optional,

    // Chapter 13: Energy 3: Conservation of Energy
    "hrk_13_1_work_done_on_a_system_by_external_forces" to hrk_13_1_work_done_on_a_system_by_external_forces,
    "hrk_13_2_internal_energy_in_a_system_of_particles" to hrk_13_2_internal_energy_in_a_system_of_particles,
    "hrk_13_3_frictional_work" to hrk_13_3_frictional_work,
    "hrk_13_4_conservation_of_energy_in_a_system_of_particles" to hrk_13_4_conservation_of_energy_in_a_system_of_particles,
    "hrk_13_5_center_of_mass_energy" to hrk_13_5_center_of_mass_energy,
    "hrk_13_6_reactions_and_decays" to hrk_13_6_reactions_and_decays,
    "hrk_13_7_energy_transfer_by_heat" to hrk_13_7_energy_transfer_by_heat,

    // Chapter 14: Gravitation
    "hrk_14_1_origin_of_the_law_of_gravitation" to hrk_14_1_origin_of_the_law_of_gravitation,
    "hrk_14_2_newtons_law_of_universal_gravitation" to hrk_14_2_newtons_law_of_universal_gravitation,
    "hrk_14_3_the_gravitational_constant_g" to hrk_14_3_the_gravitational_constant_g,
    "hrk_14_4_gravitation_near_the_earths_surface" to hrk_14_4_gravitation_near_the_earths_surface,
    "hrk_14_5_the_two_shell_theorems" to hrk_14_5_the_two_shell_theorems,
    "hrk_14_6_gravitational_potential_energy" to hrk_14_6_gravitational_potential_energy,
    "hrk_14_7_the_motions_of_planets_and_satellites" to hrk_14_7_the_motions_of_planets_and_satellites,
    "hrk_14_8_the_gravitational_field_optional" to hrk_14_8_the_gravitational_field_optional,
    "hrk_14_9_modern_developments_in_gravitation_optional" to hrk_14_9_modern_developments_in_gravitation_optional,

    // Chapter 15: Fluid Statics
    "hrk_15_1_fluids_and_solids" to hrk_15_1_fluids_and_solids,
    "hrk_15_2_pressure_and_density" to hrk_15_2_pressure_and_density,
    "hrk_15_3_variation_of_pressure_in_a_fluid_at_rest" to hrk_15_3_variation_of_pressure_in_a_fluid_at_rest,
    "hrk_15_4_pascals_principle_and_archimedes_principle" to hrk_15_4_pascals_principle_and_archimedes_principle,
    "hrk_15_5_measurement_of_pressure" to hrk_15_5_measurement_of_pressure,
    "hrk_15_6_surface_tension_optional" to hrk_15_6_surface_tension_optional,

    // Chapter 16: Fluid Dynamics
    "hrk_16_1_general_concepts_of_fluid_flow" to hrk_16_1_general_concepts_of_fluid_flow,
    "hrk_16_2_streamlines_and_the_equation_of_continuity" to hrk_16_2_streamlines_and_the_equation_of_continuity,
    "hrk_16_3_bernoullis_equation" to hrk_16_3_bernoullis_equation,
    "hrk_16_4_applications_of_bernoullis_equation_and_the_equation_of_continuity" to hrk_16_4_applications_of_bernoullis_equation_and_the_equation_of_continuity,
    "hrk_16_5_fields_of_flow_optional" to hrk_16_5_fields_of_flow_optional,
    "hrk_16_6_viscosity_turbulence_and_chaotic_flow_optional" to hrk_16_6_viscosity_turbulence_and_chaotic_flow_optional,

    // Chapter 17: Oscillations
    "hrk_17_1_oscillating_systems" to hrk_17_1_oscillating_systems,
    "hrk_17_2_the_simple_harmonic_oscillator" to hrk_17_2_the_simple_harmonic_oscillator,
    "hrk_17_3_simple_harmonic_motion" to hrk_17_3_simple_harmonic_motion,
    "hrk_17_4_energy_in_simple_harmonic_motion" to hrk_17_4_energy_in_simple_harmonic_motion,
    "hrk_17_5_applications_of_simple_harmonic_motion" to hrk_17_5_applications_of_simple_harmonic_motion,
    "hrk_17_6_simple_harmonic_motion_and_uniform_circular_motion" to hrk_17_6_simple_harmonic_motion_and_uniform_circular_motion,
    "hrk_17_7_damped_harmonic_motion" to hrk_17_7_damped_harmonic_motion,
    "hrk_17_8_forced_oscillations_and_resonance" to hrk_17_8_forced_oscillations_and_resonance,
    "hrk_17_9_two_body_oscillations_optional" to hrk_17_9_two_body_oscillations_optional,

    // Chapter 18: Wave Motion
    "hrk_18_1_mechanical_waves" to hrk_18_1_mechanical_waves,
    "hrk_18_2_types_of_waves" to hrk_18_2_types_of_waves,
    "hrk_18_3_traveling_waves" to hrk_18_3_traveling_waves,
    "hrk_18_4_wave_speed_on_a_stretched_string" to hrk_18_4_wave_speed_on_a_stretched_string,
    "hrk_18_5_the_wave_equation_optional" to hrk_18_5_the_wave_equation_optional,
    "hrk_18_6_energy_in_wave_motion" to hrk_18_6_energy_in_wave_motion,
    "hrk_18_7_the_principle_of_superposition" to hrk_18_7_the_principle_of_superposition,
    "hrk_18_8_interference_of_waves" to hrk_18_8_interference_of_waves,
    "hrk_18_9_standing_waves" to hrk_18_9_standing_waves,
    "hrk_18_10_standing_waves_and_resonance" to hrk_18_10_standing_waves_and_resonance,

    // Chapter 19: Sound Waves
    "hrk_19_1_properties_of_sound_waves" to hrk_19_1_properties_of_sound_waves,
    "hrk_19_2_traveling_sound_waves" to hrk_19_2_traveling_sound_waves,
    "hrk_19_3_the_speed_of_sound" to hrk_19_3_the_speed_of_sound,
    "hrk_19_4_power_and_intensity_of_sound_waves" to hrk_19_4_power_and_intensity_of_sound_waves,
    "hrk_19_5_interference_of_sound_waves" to hrk_19_5_interference_of_sound_waves,
    "hrk_19_6_standing_longitudinal_waves" to hrk_19_6_standing_longitudinal_waves,
    "hrk_19_7_vibrating_systems_and_sources_of_sound" to hrk_19_7_vibrating_systems_and_sources_of_sound,
    "hrk_19_8_beats" to hrk_19_8_beats,
    "hrk_19_9_the_doppler_effect" to hrk_19_9_the_doppler_effect,

    // Chapter 20: The Special Theory of Relativity
    "hrk_20_1_troubles_with_classical_physics" to hrk_20_1_troubles_with_classical_physics,
    "hrk_20_2_the_postulates_of_special_relativity" to hrk_20_2_the_postulates_of_special_relativity,
    "hrk_20_3_consequences_of_einsteins_postulates" to hrk_20_3_consequences_of_einsteins_postulates,
    "hrk_20_4_the_lorentz_transformation" to hrk_20_4_the_lorentz_transformation,
    "hrk_20_5_measuring_the_space_time_coordinates_of_an_event" to hrk_20_5_measuring_the_space_time_coordinates_of_an_event,
    "hrk_20_6_the_transformation_of_velocities" to hrk_20_6_the_transformation_of_velocities,
    "hrk_20_7_consequences_of_the_lorentz_transformation" to hrk_20_7_consequences_of_the_lorentz_transformation,
    "hrk_20_8_relativistic_momentum" to hrk_20_8_relativistic_momentum,
    "hrk_20_9_relativistic_energy" to hrk_20_9_relativistic_energy,
    "hrk_20_10_the_common_sense_of_special_relativity" to hrk_20_10_the_common_sense_of_special_relativity,

    // Chapter 21: Temperature
    "hrk_21_1_temperature_and_thermal_equilibrium" to hrk_21_1_temperature_and_thermal_equilibrium,
    "hrk_21_2_temperature_scales" to hrk_21_2_temperature_scales,
    "hrk_21_3_measuring_temperatures" to hrk_21_3_measuring_temperatures,
    "hrk_21_4_thermal_expansion" to hrk_21_4_thermal_expansion,
    "hrk_21_5_the_ideal_gas" to hrk_21_5_the_ideal_gas,

    // Chapter 22: Molecular Properties of Gases
    "hrk_22_1_the_atomic_nature_of_matter" to hrk_22_1_the_atomic_nature_of_matter,
    "hrk_22_2_a_molecular_view_of_pressure" to hrk_22_2_a_molecular_view_of_pressure,
    "hrk_22_3_the_mean_free_path" to hrk_22_3_the_mean_free_path,
    "hrk_22_4_the_distribution_of_molecular_speeds" to hrk_22_4_the_distribution_of_molecular_speeds,
    "hrk_22_5_the_distribution_of_molecular_energies" to hrk_22_5_the_distribution_of_molecular_energies,
    "hrk_22_6_equations_of_state_for_real_gases" to hrk_22_6_equations_of_state_for_real_gases,
    "hrk_22_7_the_intermolecular_forces_optional" to hrk_22_7_the_intermolecular_forces_optional,

    // Chapter 23: The First Law of Thermodynamics
    "hrk_23_1_heat_energy_in_transit" to hrk_23_1_heat_energy_in_transit,
    "hrk_23_2_the_transfer_of_heat" to hrk_23_2_the_transfer_of_heat,
    "hrk_23_3_the_first_law_of_thermodynamics" to hrk_23_3_the_first_law_of_thermodynamics,
    "hrk_23_4_heat_capacity_and_specific_heat" to hrk_23_4_heat_capacity_and_specific_heat,
    "hrk_23_5_work_done_on_or_by_an_ideal_gas" to hrk_23_5_work_done_on_or_by_an_ideal_gas,
    "hrk_23_6_the_internal_energy_of_an_ideal_gas" to hrk_23_6_the_internal_energy_of_an_ideal_gas,
    "hrk_23_7_heat_capacities_of_an_ideal_gas" to hrk_23_7_heat_capacities_of_an_ideal_gas,
    "hrk_23_8_applications_of_the_first_law_of_thermodynamics" to hrk_23_8_applications_of_the_first_law_of_thermodynamics,

    // Chapter 24: Entropy and the Second Law of Thermodynamics
    "hrk_24_1_one_way_processes" to hrk_24_1_one_way_processes,
    "hrk_24_2_defining_entropy_change" to hrk_24_2_defining_entropy_change,
    "hrk_24_3_entropy_change_for_irreversible_processes" to hrk_24_3_entropy_change_for_irreversible_processes,
    "hrk_24_4_the_second_law_of_thermodynamics" to hrk_24_4_the_second_law_of_thermodynamics,
    "hrk_24_5_entropy_and_the_performance_of_engines" to hrk_24_5_entropy_and_the_performance_of_engines,
    "hrk_24_6_entropy_and_the_performance_of_refrigerators" to hrk_24_6_entropy_and_the_performance_of_refrigerators,
    "hrk_24_7_the_efficiencies_of_real_engines" to hrk_24_7_the_efficiencies_of_real_engines,
    "hrk_24_8_the_second_law_revisited" to hrk_24_8_the_second_law_revisited,
    "hrk_24_9_a_statistical_view_of_entropy" to hrk_24_9_a_statistical_view_of_entropy,

    // Chapter 25: Electric Charge and Coulomb's Law
    "hrk_25_1_electromagnetism_a_preview" to hrk_25_1_electromagnetism_a_preview,
    "hrk_25_2_electric_charge" to hrk_25_2_electric_charge,
    "hrk_25_3_conductors_and_insulators" to hrk_25_3_conductors_and_insulators,
    "hrk_25_4_coulombs_law" to hrk_25_4_coulombs_law,
    "hrk_25_5_continuous_charge_distributions" to hrk_25_5_continuous_charge_distributions,
    "hrk_25_6_conservation_of_charge" to hrk_25_6_conservation_of_charge,

    // Chapter 26: The Electric Field
    "hrk_26_1_what_is_a_field" to hrk_26_1_what_is_a_field,
    "hrk_26_2_the_electric_field" to hrk_26_2_the_electric_field,
    "hrk_26_3_the_electric_field_of_point_charges" to hrk_26_3_the_electric_field_of_point_charges,
    "hrk_26_4_electric_field_of_continuous_charge_distributions" to hrk_26_4_electric_field_of_continuous_charge_distributions,
    "hrk_26_5_electric_field_lines" to hrk_26_5_electric_field_lines,
    "hrk_26_6_a_point_charge_in_an_electric_field" to hrk_26_6_a_point_charge_in_an_electric_field,
    "hrk_26_7_a_dipole_in_an_electric_field" to hrk_26_7_a_dipole_in_an_electric_field,
    "hrk_26_8_the_nuclear_model_of_the_atom_optional" to hrk_26_8_the_nuclear_model_of_the_atom_optional,

    // Chapter 27: Gauss' Law
    "hrk_27_1_what_is_gauss_law_all_about" to hrk_27_1_what_is_gauss_law_all_about,
    "hrk_27_2_the_flux_of_a_vector_field" to hrk_27_2_the_flux_of_a_vector_field,
    "hrk_27_3_the_flux_of_the_electric_field" to hrk_27_3_the_flux_of_the_electric_field,
    "hrk_27_4_gauss_law" to hrk_27_4_gauss_law,
    "hrk_27_5_applications_of_gauss_law" to hrk_27_5_applications_of_gauss_law,
    "hrk_27_6_gauss_law_and_conductors" to hrk_27_6_gauss_law_and_conductors,
    "hrk_27_7_experimental_tests_of_gauss_law_and_coulombs_law" to hrk_27_7_experimental_tests_of_gauss_law_and_coulombs_law,

    // Chapter 28: Electric Potential Energy and Potential
    "hrk_28_1_potential_energy" to hrk_28_1_potential_energy,
    "hrk_28_2_electric_potential_energy" to hrk_28_2_electric_potential_energy,
    "hrk_28_3_electric_potential" to hrk_28_3_electric_potential,
    "hrk_28_4_calculating_the_potential_from_the_field" to hrk_28_4_calculating_the_potential_from_the_field,
    "hrk_28_5_potential_due_to_point_charges" to hrk_28_5_potential_due_to_point_charges,
    "hrk_28_6_electric_potential_of_continuous_charge_distributions" to hrk_28_6_electric_potential_of_continuous_charge_distributions,
    "hrk_28_7_calculating_the_field_from_the_potential" to hrk_28_7_calculating_the_field_from_the_potential,
    "hrk_28_8_equipotential_surfaces" to hrk_28_8_equipotential_surfaces,
    "hrk_28_9_the_potential_of_a_charged_conductor" to hrk_28_9_the_potential_of_a_charged_conductor,
    "hrk_28_10_the_electrostatic_accelerator_optional" to hrk_28_10_the_electrostatic_accelerator_optional,

    // Chapter 29: The Electrical Properties of Materials
    "hrk_29_1_types_of_materials" to hrk_29_1_types_of_materials,
    "hrk_29_2_a_conductor_in_an_electric_field_static_conditions" to hrk_29_2_a_conductor_in_an_electric_field_static_conditions,
    "hrk_29_3_a_conductor_in_an_electric_field_dynamic_conditions" to hrk_29_3_a_conductor_in_an_electric_field_dynamic_conditions,
    "hrk_29_4_ohmic_materials" to hrk_29_4_ohmic_materials,
    "hrk_29_5_ohms_law_a_microscopic_view" to hrk_29_5_ohms_law_a_microscopic_view,
    "hrk_29_6_an_insulator_in_an_electric_field" to hrk_29_6_an_insulator_in_an_electric_field,

    // Chapter 30: Capacitance
    "hrk_30_1_capacitors" to hrk_30_1_capacitors,
    "hrk_30_2_capacitance" to hrk_30_2_capacitance,
    "hrk_30_3_calculating_the_capacitance" to hrk_30_3_calculating_the_capacitance,
    "hrk_30_4_capacitors_in_series_and_parallel" to hrk_30_4_capacitors_in_series_and_parallel,
    "hrk_30_5_energy_storage_in_an_electric_field" to hrk_30_5_energy_storage_in_an_electric_field,
    "hrk_30_6_capacitor_with_dielectric" to hrk_30_6_capacitor_with_dielectric,

    // Chapter 31: DC Circuits
    "hrk_31_1_electric_current" to hrk_31_1_electric_current,
    "hrk_31_2_electromotive_force" to hrk_31_2_electromotive_force,
    "hrk_31_3_analysis_of_circuits" to hrk_31_3_analysis_of_circuits,
    "hrk_31_4_electric_fields_in_circuits" to hrk_31_4_electric_fields_in_circuits,
    "hrk_31_5_resistors_in_series_and_parallel" to hrk_31_5_resistors_in_series_and_parallel,
    "hrk_31_6_energy_transfers_in_an_electric_circuit" to hrk_31_6_energy_transfers_in_an_electric_circuit,
    "hrk_31_7_rc_circuits" to hrk_31_7_rc_circuits,

    // Chapter 32: The Magnetic Field
    "hrk_32_1_magnetic_interactions_and_magnetic_poles" to hrk_32_1_magnetic_interactions_and_magnetic_poles,
    "hrk_32_2_the_magnetic_force_on_a_moving_charge" to hrk_32_2_the_magnetic_force_on_a_moving_charge,
    "hrk_32_3_circulating_charges" to hrk_32_3_circulating_charges,
    "hrk_32_4_the_hall_effect" to hrk_32_4_the_hall_effect,
    "hrk_32_5_the_magnetic_force_on_a_current_carrying_wire" to hrk_32_5_the_magnetic_force_on_a_current_carrying_wire,
    "hrk_32_6_the_torque_on_a_current_loop" to hrk_32_6_the_torque_on_a_current_loop,

    // Chapter 33: The Magnetic Field of a Current
    "hrk_33_1_the_magnetic_field_due_to_a_moving_charge" to hrk_33_1_the_magnetic_field_due_to_a_moving_charge,
    "hrk_33_2_the_magnetic_field_of_a_current" to hrk_33_2_the_magnetic_field_of_a_current,
    "hrk_33_3_two_parallel_currents" to hrk_33_3_two_parallel_currents,
    "hrk_33_4_the_magnetic_field_of_a_solenoid" to hrk_33_4_the_magnetic_field_of_a_solenoid,
    "hrk_33_5_amperes_law" to hrk_33_5_amperes_law,
    "hrk_33_6_electromagnetism_and_frames_of_reference_optional" to hrk_33_6_electromagnetism_and_frames_of_reference_optional,

    // Chapter 34: Faraday's Law of Induction
    "hrk_34_1_faradays_experiments" to hrk_34_1_faradays_experiments,
    "hrk_34_2_faradays_law_of_induction" to hrk_34_2_faradays_law_of_induction,
    "hrk_34_3_lenz_law" to hrk_34_3_lenz_law,
    "hrk_34_4_motional_emf" to hrk_34_4_motional_emf,
    "hrk_34_5_generators_and_motors" to hrk_34_5_generators_and_motors,
    "hrk_34_6_induced_electric_fields" to hrk_34_6_induced_electric_fields,
    "hrk_34_7_induction_and_relative_motion_optional" to hrk_34_7_induction_and_relative_motion_optional,

    // Chapter 35: Magnetic Properties of Materials
    "hrk_35_1_the_magnetic_dipole" to hrk_35_1_the_magnetic_dipole,
    "hrk_35_2_the_force_on_a_dipole_in_a_nonuniform_field" to hrk_35_2_the_force_on_a_dipole_in_a_nonuniform_field,
    "hrk_35_3_atomic_and_nuclear_magnetism" to hrk_35_3_atomic_and_nuclear_magnetism,
    "hrk_35_4_magnetization" to hrk_35_4_magnetization,
    "hrk_35_5_magnetic_materials" to hrk_35_5_magnetic_materials,
    "hrk_35_6_the_magnetism_of_the_planets_optional" to hrk_35_6_the_magnetism_of_the_planets_optional,
    "hrk_35_7_gauss_law_for_magnetism" to hrk_35_7_gauss_law_for_magnetism,

    // Chapter 36: Inductance
    "hrk_36_1_inductance" to hrk_36_1_inductance,
    "hrk_36_2_calculating_the_inductance" to hrk_36_2_calculating_the_inductance,
    "hrk_36_3_lr_circuits" to hrk_36_3_lr_circuits,
    "hrk_36_4_energy_storage_in_a_magnetic_field" to hrk_36_4_energy_storage_in_a_magnetic_field,
    "hrk_36_5_electromagnetic_oscillations_qualitative" to hrk_36_5_electromagnetic_oscillations_qualitative,
    "hrk_36_6_electromagnetic_oscillations_quantitative" to hrk_36_6_electromagnetic_oscillations_quantitative,
    "hrk_36_7_damped_and_forced_oscillations" to hrk_36_7_damped_and_forced_oscillations,

    // Chapter 37: Alternating Current Circuits
    "hrk_37_1_alternating_currents" to hrk_37_1_alternating_currents,
    "hrk_37_2_three_separate_elements" to hrk_37_2_three_separate_elements,
    "hrk_37_3_the_single_loop_rlc_circuit" to hrk_37_3_the_single_loop_rlc_circuit,
    "hrk_37_4_power_in_ac_circuits" to hrk_37_4_power_in_ac_circuits,
    "hrk_37_5_the_transformer_optional" to hrk_37_5_the_transformer_optional,

    // Chapter 38: Maxwell's Equations and Electromagnetic Waves
    "hrk_38_1_the_basic_equations_of_electromagnetism" to hrk_38_1_the_basic_equations_of_electromagnetism,
    "hrk_38_2_induced_magnetic_fields_and_the_displacement_current" to hrk_38_2_induced_magnetic_fields_and_the_displacement_current,
    "hrk_38_3_maxwells_equations" to hrk_38_3_maxwells_equations,
    "hrk_38_4_generating_an_electromagnetic_wave" to hrk_38_4_generating_an_electromagnetic_wave,
    "hrk_38_5_traveling_waves_and_maxwells_equations" to hrk_38_5_traveling_waves_and_maxwells_equations,
    "hrk_38_6_energy_transport_and_the_poynting_vector" to hrk_38_6_energy_transport_and_the_poynting_vector,
    "hrk_38_7_radiation_pressure" to hrk_38_7_radiation_pressure,

    // Chapter 39: Light Waves
    "hrk_39_1_the_electromagnetic_spectrum" to hrk_39_1_the_electromagnetic_spectrum,
    "hrk_39_2_visible_light" to hrk_39_2_visible_light,
    "hrk_39_3_the_speed_of_light" to hrk_39_3_the_speed_of_light,
    "hrk_39_4_reflection_and_refraction_of_light_waves" to hrk_39_4_reflection_and_refraction_of_light_waves,
    "hrk_39_5_total_internal_reflection" to hrk_39_5_total_internal_reflection,
    "hrk_39_6_the_doppler_effect_for_light" to hrk_39_6_the_doppler_effect_for_light,

    // Chapter 40: Mirrors and Lenses
    "hrk_40_1_image_formation_by_mirrors_and_lenses" to hrk_40_1_image_formation_by_mirrors_and_lenses,
    "hrk_40_2_plane_mirrors" to hrk_40_2_plane_mirrors,
    "hrk_40_3_spherical_mirrors" to hrk_40_3_spherical_mirrors,
    "hrk_40_4_spherical_refracting_surfaces" to hrk_40_4_spherical_refracting_surfaces,
    "hrk_40_5_thin_lenses" to hrk_40_5_thin_lenses,
    "hrk_40_6_optical_instruments" to hrk_40_6_optical_instruments,

    // Chapter 41: Interference
    "hrk_41_1_two_source_interference" to hrk_41_1_two_source_interference,
    "hrk_41_2_double_slit_interference" to hrk_41_2_double_slit_interference,
    "hrk_41_3_coherence" to hrk_41_3_coherence,
    "hrk_41_4_intensity_in_double_slit_interference" to hrk_41_4_intensity_in_double_slit_interference,
    "hrk_41_5_interference_from_thin_films" to hrk_41_5_interference_from_thin_films,
    "hrk_41_6_michelsons_interferometer" to hrk_41_6_michelsons_interferometer,

    // Chapter 42: Diffraction
    "hrk_42_1_diffraction_and_the_wave_theory_of_light" to hrk_42_1_diffraction_and_the_wave_theory_of_light,
    "hrk_42_2_single_slit_diffraction" to hrk_42_2_single_slit_diffraction,
    "hrk_42_3_intensity_in_single_slit_diffraction" to hrk_42_3_intensity_in_single_slit_diffraction,
    "hrk_42_4_diffraction_at_a_circular_aperture" to hrk_42_4_diffraction_at_a_circular_aperture,
    "hrk_42_5_double_slit_interference_and_diffraction_combined" to hrk_42_5_double_slit_interference_and_diffraction_combined,

    // Chapter 43: Gratings and Spectra
    "hrk_43_1_multiple_slits" to hrk_43_1_multiple_slits,
    "hrk_43_2_diffraction_gratings" to hrk_43_2_diffraction_gratings,
    "hrk_43_3_dispersion_and_resolving_power" to hrk_43_3_dispersion_and_resolving_power,
    "hrk_43_4_x_ray_diffraction" to hrk_43_4_x_ray_diffraction,
    "hrk_43_5_holography_optional" to hrk_43_5_holography_optional,

    // Chapter 44: Polarization
    "hrk_44_1_polarization_of_electromagnetic_waves" to hrk_44_1_polarization_of_electromagnetic_waves,
    "hrk_44_2_polarizing_sheets" to hrk_44_2_polarizing_sheets,
    "hrk_44_3_polarization_by_reflection" to hrk_44_3_polarization_by_reflection,
    "hrk_44_4_double_refraction" to hrk_44_4_double_refraction,
    "hrk_44_5_circular_polarization" to hrk_44_5_circular_polarization,
    "hrk_44_6_polarization_by_scattering" to hrk_44_6_polarization_by_scattering,

    // Chapter 45: The Nature of Light
    "hrk_45_1_introducing_the_photon" to hrk_45_1_introducing_the_photon,
    "hrk_45_2_thermal_radiation" to hrk_45_2_thermal_radiation,
    "hrk_45_3_the_photoelectric_effect" to hrk_45_3_the_photoelectric_effect,
    "hrk_45_4_the_compton_effect" to hrk_45_4_the_compton_effect,
    "hrk_45_5_the_photon_revealed" to hrk_45_5_the_photon_revealed,
    "hrk_45_6_photons_and_waves" to hrk_45_6_photons_and_waves,
    "hrk_45_7_slowing_down_atoms_by_photon_bombardment" to hrk_45_7_slowing_down_atoms_by_photon_bombardment,

    // Chapter 46: The Nature of Matter
    "hrk_46_1_matter_waves" to hrk_46_1_matter_waves,
    "hrk_46_2_testing_debroglies_hypothesis" to hrk_46_2_testing_debroglies_hypothesis,
    "hrk_46_3_waves_and_particles" to hrk_46_3_waves_and_particles,
    "hrk_46_4_heisenbergs_uncertainty_principle" to hrk_46_4_heisenbergs_uncertainty_principle,
    "hrk_46_5_the_wave_function" to hrk_46_5_the_wave_function,
    "hrk_46_6_schrodingers_equation" to hrk_46_6_schrodingers_equation,
    "hrk_46_7_barrier_tunneling" to hrk_46_7_barrier_tunneling,

    // Chapter 47: Electrons in Potential Wells
    "hrk_47_1_electrons_free_and_bound" to hrk_47_1_electrons_free_and_bound,
    "hrk_47_2_an_electron_trapped_in_a_potential_well" to hrk_47_2_an_electron_trapped_in_a_potential_well,
    "hrk_47_3_an_electron_trapped_in_a_finite_well" to hrk_47_3_an_electron_trapped_in_a_finite_well,
    "hrk_47_4_an_electron_trapped_in_an_atom" to hrk_47_4_an_electron_trapped_in_an_atom,
    "hrk_47_5_the_ground_state_of_the_hydrogen_atom" to hrk_47_5_the_ground_state_of_the_hydrogen_atom,
    "hrk_47_6_angular_momentum_of_electrons_in_atoms" to hrk_47_6_angular_momentum_of_electrons_in_atoms,
    "hrk_47_7_an_excited_state_of_the_hydrogen_atom" to hrk_47_7_an_excited_state_of_the_hydrogen_atom,
    "hrk_47_8_counting_the_states_of_hydrogen" to hrk_47_8_counting_the_states_of_hydrogen,

    // Chapter 48: Atomic Structure
    "hrk_48_1_the_x_ray_spectrum_of_atoms" to hrk_48_1_the_x_ray_spectrum_of_atoms,
    "hrk_48_2_x_rays_and_the_numbering_of_the_elements" to hrk_48_2_x_rays_and_the_numbering_of_the_elements,
    "hrk_48_3_building_atoms" to hrk_48_3_building_atoms,
    "hrk_48_4_the_periodic_table" to hrk_48_4_the_periodic_table,
    "hrk_48_5_atomic_magnetism" to hrk_48_5_atomic_magnetism,
    "hrk_48_6_the_stern_gerlach_experiment" to hrk_48_6_the_stern_gerlach_experiment,
    "hrk_48_7_nuclear_magnetic_resonance" to hrk_48_7_nuclear_magnetic_resonance,
    "hrk_48_8_magnetism_and_atomic_radiations_optional" to hrk_48_8_magnetism_and_atomic_radiations_optional,
    "hrk_48_9_lasers_and_laser_light" to hrk_48_9_lasers_and_laser_light,

    // Chapter 49: Electrical Conduction in Solids
    "hrk_49_1_quantum_theory_of_solids" to hrk_49_1_quantum_theory_of_solids,
    "hrk_49_2_conduction_electrons_in_a_metal" to hrk_49_2_conduction_electrons_in_a_metal,
    "hrk_49_3_filling_the_allowed_states" to hrk_49_3_filling_the_allowed_states,
    "hrk_49_4_electrical_conduction_in_metals" to hrk_49_4_electrical_conduction_in_metals,
    "hrk_49_5_bands_and_gaps" to hrk_49_5_bands_and_gaps,
    "hrk_49_6_conductors_insulators_and_semiconductors" to hrk_49_6_conductors_insulators_and_semiconductors,
    "hrk_49_7_doped_semiconductors" to hrk_49_7_doped_semiconductors,
    "hrk_49_8_the_pn_junction" to hrk_49_8_the_pn_junction,
    "hrk_49_9_optical_electronics" to hrk_49_9_optical_electronics,
    "hrk_49_10_the_transistor" to hrk_49_10_the_transistor,
    "hrk_49_11_superconductors" to hrk_49_11_superconductors,

    // Chapter 50: Nuclear Physics
    "hrk_50_1_discovering_the_nucleus" to hrk_50_1_discovering_the_nucleus,
    "hrk_50_2_some_nuclear_properties" to hrk_50_2_some_nuclear_properties,
    "hrk_50_3_radioactive_decay" to hrk_50_3_radioactive_decay,
    "hrk_50_4_alpha_decay" to hrk_50_4_alpha_decay,
    "hrk_50_5_beta_decay" to hrk_50_5_beta_decay,
    "hrk_50_6_measuring_ionizing_radiation" to hrk_50_6_measuring_ionizing_radiation,
    "hrk_50_7_natural_radioactivity" to hrk_50_7_natural_radioactivity,
    "hrk_50_8_nuclear_reactions" to hrk_50_8_nuclear_reactions,
    "hrk_50_9_nuclear_models_optional" to hrk_50_9_nuclear_models_optional,

    // Chapter 51: Energy from the Nucleus
    "hrk_51_1_the_atom_and_the_nucleus" to hrk_51_1_the_atom_and_the_nucleus,
    "hrk_51_2_nuclear_fission_the_basic_process" to hrk_51_2_nuclear_fission_the_basic_process,
    "hrk_51_3_theory_of_nuclear_fission" to hrk_51_3_theory_of_nuclear_fission,
    "hrk_51_4_nuclear_reactors_the_basic_principles" to hrk_51_4_nuclear_reactors_the_basic_principles,
    "hrk_51_5_a_natural_reactor" to hrk_51_5_a_natural_reactor,
    "hrk_51_6_thermonuclear_fusion_the_basic_process" to hrk_51_6_thermonuclear_fusion_the_basic_process,
    "hrk_51_7_thermonuclear_fusion_in_stars" to hrk_51_7_thermonuclear_fusion_in_stars,
    "hrk_51_8_controlled_thermonuclear_fusion" to hrk_51_8_controlled_thermonuclear_fusion,

    // Chapter 52: Particle Physics and Cosmology
    "hrk_52_1_particle_interactions" to hrk_52_1_particle_interactions,
    "hrk_52_2_families_of_particles" to hrk_52_2_families_of_particles,
    "hrk_52_3_conservation_laws" to hrk_52_3_conservation_laws,
    "hrk_52_4_the_quark_model" to hrk_52_4_the_quark_model,
    "hrk_52_5_the_big_bang_cosmology" to hrk_52_5_the_big_bang_cosmology,
    "hrk_52_6_nucleosynthesis" to hrk_52_6_nucleosynthesis,
    "hrk_52_7_the_age_of_the_universe" to hrk_52_7_the_age_of_the_universe,

    // ===== Stewart =====

    // Chapter 1: Functions and Models
    "stewart_1_1_four_ways_to_represent_a_function" to stewart_1_1_four_ways_to_represent_a_function,
    "stewart_1_2_mathematical_models_a_catalog_of_essential_functions" to stewart_1_2_mathematical_models_a_catalog_of_essential_functions,
    "stewart_1_3_new_functions_from_old_functions" to stewart_1_3_new_functions_from_old_functions,
    "stewart_1_4_exponential_functions" to stewart_1_4_exponential_functions,
    "stewart_1_5_inverse_functions_and_logarithms" to stewart_1_5_inverse_functions_and_logarithms,

    // Chapter 2: Limits and Derivatives
    "stewart_2_1_the_tangent_and_velocity_problems" to stewart_2_1_the_tangent_and_velocity_problems,
    "stewart_2_2_the_limit_of_a_function" to stewart_2_2_the_limit_of_a_function,
    "stewart_2_3_calculating_limits_using_the_limit_laws" to stewart_2_3_calculating_limits_using_the_limit_laws,
    "stewart_2_4_the_precise_definition_of_a_limit" to stewart_2_4_the_precise_definition_of_a_limit,
    "stewart_2_5_continuity" to stewart_2_5_continuity,
    "stewart_2_6_limits_at_infinity_horizontal_asymptotes" to stewart_2_6_limits_at_infinity_horizontal_asymptotes,
    "stewart_2_7_derivatives_and_rates_of_change" to stewart_2_7_derivatives_and_rates_of_change,
    "stewart_2_8_the_derivative_as_a_function" to stewart_2_8_the_derivative_as_a_function,

    // Chapter 3: Differentiation Rules
    "stewart_3_1_derivatives_of_polynomials_and_exponential_functions" to stewart_3_1_derivatives_of_polynomials_and_exponential_functions,
    "stewart_3_2_the_product_and_quotient_rules" to stewart_3_2_the_product_and_quotient_rules,
    "stewart_3_3_derivatives_of_trigonometric_functions" to stewart_3_3_derivatives_of_trigonometric_functions,
    "stewart_3_4_the_chain_rule" to stewart_3_4_the_chain_rule,
    "stewart_3_5_implicit_differentiation" to stewart_3_5_implicit_differentiation,
    "stewart_3_6_derivatives_of_logarithmic_functions" to stewart_3_6_derivatives_of_logarithmic_functions,
    "stewart_3_7_rates_of_change_in_the_natural_and_social_sciences" to stewart_3_7_rates_of_change_in_the_natural_and_social_sciences,
    "stewart_3_8_exponential_growth_and_decay" to stewart_3_8_exponential_growth_and_decay,
    "stewart_3_9_related_rates" to stewart_3_9_related_rates,
    "stewart_3_10_linear_approximations_and_differentials" to stewart_3_10_linear_approximations_and_differentials,
    "stewart_3_11_hyperbolic_functions" to stewart_3_11_hyperbolic_functions,

    // Chapter 4: Applications of Differentiation
    "stewart_4_1_maximum_and_minimum_values" to stewart_4_1_maximum_and_minimum_values,
    "stewart_4_2_the_mean_value_theorem" to stewart_4_2_the_mean_value_theorem,
    "stewart_4_3_how_derivatives_affect_the_shape_of_a_graph" to stewart_4_3_how_derivatives_affect_the_shape_of_a_graph,
    "stewart_4_4_indeterminate_forms_and_lhospitals_rule" to stewart_4_4_indeterminate_forms_and_lhospitals_rule,
    "stewart_4_5_summary_of_curve_sketching" to stewart_4_5_summary_of_curve_sketching,
    "stewart_4_6_graphing_with_calculus_and_calculators" to stewart_4_6_graphing_with_calculus_and_calculators,
    "stewart_4_7_optimization_problems" to stewart_4_7_optimization_problems,
    "stewart_4_8_newtons_method" to stewart_4_8_newtons_method,
    "stewart_4_9_antiderivatives" to stewart_4_9_antiderivatives,

    // Chapter 5: Integrals
    "stewart_5_1_areas_and_distances" to stewart_5_1_areas_and_distances,
    "stewart_5_2_the_definite_integral" to stewart_5_2_the_definite_integral,
    "stewart_5_3_the_fundamental_theorem_of_calculus" to stewart_5_3_the_fundamental_theorem_of_calculus,
    "stewart_5_4_indefinite_integrals_and_the_net_change_theorem" to stewart_5_4_indefinite_integrals_and_the_net_change_theorem,
    "stewart_5_5_the_substitution_rule" to stewart_5_5_the_substitution_rule,

    // Chapter 6: Applications of Integration
    "stewart_6_1_areas_between_curves" to stewart_6_1_areas_between_curves,
    "stewart_6_2_volumes" to stewart_6_2_volumes,
    "stewart_6_3_volumes_by_cylindrical_shells" to stewart_6_3_volumes_by_cylindrical_shells,
    "stewart_6_4_work" to stewart_6_4_work,
    "stewart_6_5_average_value_of_a_function" to stewart_6_5_average_value_of_a_function,

    // Chapter 7: Techniques of Integration
    "stewart_7_1_integration_by_parts" to stewart_7_1_integration_by_parts,
    "stewart_7_2_trigonometric_integrals" to stewart_7_2_trigonometric_integrals,
    "stewart_7_3_trigonometric_substitution" to stewart_7_3_trigonometric_substitution,
    "stewart_7_4_integration_of_rational_functions_by_partial_fractions" to stewart_7_4_integration_of_rational_functions_by_partial_fractions,
    "stewart_7_5_strategy_for_integration" to stewart_7_5_strategy_for_integration,
    "stewart_7_6_integration_using_tables_and_computer_algebra_systems" to stewart_7_6_integration_using_tables_and_computer_algebra_systems,
    "stewart_7_7_approximate_integration" to stewart_7_7_approximate_integration,
    "stewart_7_8_improper_integrals" to stewart_7_8_improper_integrals,

    // Chapter 8: Further Applications of Integration
    "stewart_8_1_arc_length" to stewart_8_1_arc_length,
    "stewart_8_2_area_of_a_surface_of_revolution" to stewart_8_2_area_of_a_surface_of_revolution,
    "stewart_8_3_applications_to_physics_and_engineering" to stewart_8_3_applications_to_physics_and_engineering,
    "stewart_8_4_applications_to_economics_and_biology" to stewart_8_4_applications_to_economics_and_biology,
    "stewart_8_5_probability" to stewart_8_5_probability,

    // Chapter 9: Differential Equations
    "stewart_9_1_modeling_with_differential_equations" to stewart_9_1_modeling_with_differential_equations,
    "stewart_9_2_direction_fields_and_eulers_method" to stewart_9_2_direction_fields_and_eulers_method,
    "stewart_9_3_separable_equations" to stewart_9_3_separable_equations,
    "stewart_9_4_models_for_population_growth" to stewart_9_4_models_for_population_growth,
    "stewart_9_5_linear_equations" to stewart_9_5_linear_equations,
    "stewart_9_6_predator_prey_systems" to stewart_9_6_predator_prey_systems,

    // Chapter 10: Parametric Equations and Polar Coordinates
    "stewart_10_1_curves_defined_by_parametric_equations" to stewart_10_1_curves_defined_by_parametric_equations,
    "stewart_10_2_calculus_with_parametric_curves" to stewart_10_2_calculus_with_parametric_curves,
    "stewart_10_3_polar_coordinates" to stewart_10_3_polar_coordinates,
    "stewart_10_4_areas_and_lengths_in_polar_coordinates" to stewart_10_4_areas_and_lengths_in_polar_coordinates,
    "stewart_10_5_conic_sections" to stewart_10_5_conic_sections,
    "stewart_10_6_conic_sections_in_polar_coordinates" to stewart_10_6_conic_sections_in_polar_coordinates,

    // Chapter 11: Infinite Sequences and Series
    "stewart_11_1_sequences" to stewart_11_1_sequences,
    "stewart_11_2_series" to stewart_11_2_series,
    "stewart_11_3_the_integral_test_and_estimates_of_sums" to stewart_11_3_the_integral_test_and_estimates_of_sums,
    "stewart_11_4_the_comparison_tests" to stewart_11_4_the_comparison_tests,
    "stewart_11_5_alternating_series" to stewart_11_5_alternating_series,
    "stewart_11_6_absolute_convergence_and_the_ratio_and_root_tests" to stewart_11_6_absolute_convergence_and_the_ratio_and_root_tests,
    "stewart_11_7_strategy_for_testing_series" to stewart_11_7_strategy_for_testing_series,
    "stewart_11_8_power_series" to stewart_11_8_power_series,
    "stewart_11_9_representations_of_functions_as_power_series" to stewart_11_9_representations_of_functions_as_power_series,
    "stewart_11_10_taylor_and_maclaurin_series" to stewart_11_10_taylor_and_maclaurin_series,
    "stewart_11_11_applications_of_taylor_polynomials" to stewart_11_11_applications_of_taylor_polynomials,

    // Chapter 12: Vectors and the Geometry of Space
    "stewart_12_1_three_dimensional_coordinate_systems" to stewart_12_1_three_dimensional_coordinate_systems,
    "stewart_12_2_vectors" to stewart_12_2_vectors,
    "stewart_12_3_the_dot_product" to stewart_12_3_the_dot_product,
    "stewart_12_4_the_cross_product" to stewart_12_4_the_cross_product,
    "stewart_12_5_equations_of_lines_and_planes" to stewart_12_5_equations_of_lines_and_planes,
    "stewart_12_6_cylinders_and_quadric_surfaces" to stewart_12_6_cylinders_and_quadric_surfaces,

    // Chapter 13: Vector Functions
    "stewart_13_1_vector_functions_and_space_curves" to stewart_13_1_vector_functions_and_space_curves,
    "stewart_13_2_derivatives_and_integrals_of_vector_functions" to stewart_13_2_derivatives_and_integrals_of_vector_functions,
    "stewart_13_3_arc_length_and_curvature" to stewart_13_3_arc_length_and_curvature,
    "stewart_13_4_motion_in_space_velocity_and_acceleration" to stewart_13_4_motion_in_space_velocity_and_acceleration,

    // Chapter 14: Partial Derivatives
    "stewart_14_1_functions_of_several_variables" to stewart_14_1_functions_of_several_variables,
    "stewart_14_2_limits_and_continuity" to stewart_14_2_limits_and_continuity,
    "stewart_14_3_partial_derivatives" to stewart_14_3_partial_derivatives,
    "stewart_14_4_tangent_planes_and_linear_approximations" to stewart_14_4_tangent_planes_and_linear_approximations,
    "stewart_14_5_the_chain_rule" to stewart_14_5_the_chain_rule,
    "stewart_14_6_directional_derivatives_and_the_gradient_vector" to stewart_14_6_directional_derivatives_and_the_gradient_vector,
    "stewart_14_7_maximum_and_minimum_values" to stewart_14_7_maximum_and_minimum_values,
    "stewart_14_8_lagrange_multipliers" to stewart_14_8_lagrange_multipliers,

    // Chapter 15: Multiple Integrals
    "stewart_15_1_double_integrals_over_rectangles" to stewart_15_1_double_integrals_over_rectangles,
    "stewart_15_2_double_integrals_over_general_regions" to stewart_15_2_double_integrals_over_general_regions,
    "stewart_15_3_double_integrals_in_polar_coordinates" to stewart_15_3_double_integrals_in_polar_coordinates,
    "stewart_15_4_applications_of_double_integrals" to stewart_15_4_applications_of_double_integrals,
    "stewart_15_5_surface_area" to stewart_15_5_surface_area,
    "stewart_15_6_triple_integrals" to stewart_15_6_triple_integrals,
    "stewart_15_7_triple_integrals_in_cylindrical_coordinates" to stewart_15_7_triple_integrals_in_cylindrical_coordinates,
    "stewart_15_8_triple_integrals_in_spherical_coordinates" to stewart_15_8_triple_integrals_in_spherical_coordinates,
    "stewart_15_9_change_of_variables_in_multiple_integrals" to stewart_15_9_change_of_variables_in_multiple_integrals,

    // Chapter 16: Vector Calculus
    "stewart_16_1_vector_fields" to stewart_16_1_vector_fields,
    "stewart_16_2_line_integrals" to stewart_16_2_line_integrals,
    "stewart_16_3_the_fundamental_theorem_for_line_integrals" to stewart_16_3_the_fundamental_theorem_for_line_integrals,
    "stewart_16_4_greens_theorem" to stewart_16_4_greens_theorem,
    "stewart_16_5_curl_and_divergence" to stewart_16_5_curl_and_divergence,
    "stewart_16_6_parametric_surfaces_and_their_areas" to stewart_16_6_parametric_surfaces_and_their_areas,
    "stewart_16_7_surface_integrals" to stewart_16_7_surface_integrals,
    "stewart_16_8_stokes_theorem" to stewart_16_8_stokes_theorem,
    "stewart_16_9_the_divergence_theorem" to stewart_16_9_the_divergence_theorem,
    "stewart_16_10_summary" to stewart_16_10_summary,

    // Chapter 17: Second-Order Differential Equations
    "stewart_17_1_second_order_linear_equations" to stewart_17_1_second_order_linear_equations,
    "stewart_17_2_nonhomogeneous_linear_equations" to stewart_17_2_nonhomogeneous_linear_equations,
    "stewart_17_3_applications_of_second_order_differential_equations" to stewart_17_3_applications_of_second_order_differential_equations,
    "stewart_17_4_series_solutions" to stewart_17_4_series_solutions,
)