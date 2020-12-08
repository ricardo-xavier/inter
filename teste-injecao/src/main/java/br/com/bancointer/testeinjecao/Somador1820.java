package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1820")
public class Somador1820 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
