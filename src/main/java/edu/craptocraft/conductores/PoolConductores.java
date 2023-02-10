package edu.craptocraft.conductores;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PoolConductores {
    private java.util.List<Conductor> poolConductores = new ArrayList<Conductor>();

    public PoolConductores(java.util.List<Conductor> poolConductores) {
        this.poolConductores =  poolConductores;
    }

    public Conductor asignarConductor(){
        Conductor conductor = new Conductor();
        Optional<Conductor> conductorAsignado = this.poolConductores.stream()
                .filter(o -> !o.isOcupado())
                .findFirst();
        return conductorAsignado.isPresent()?conductorAsignado.get(): conductor;
    }
}
