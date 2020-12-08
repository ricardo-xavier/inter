package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1852")
public class Somador1852 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
