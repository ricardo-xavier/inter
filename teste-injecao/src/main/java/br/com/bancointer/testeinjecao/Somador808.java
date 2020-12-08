package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador808")
public class Somador808 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
