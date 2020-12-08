package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador346")
public class Somador346 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
