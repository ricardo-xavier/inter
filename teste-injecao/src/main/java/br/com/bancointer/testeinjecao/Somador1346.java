package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1346")
public class Somador1346 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
