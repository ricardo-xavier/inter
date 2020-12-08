package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1425")
public class Somador1425 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
